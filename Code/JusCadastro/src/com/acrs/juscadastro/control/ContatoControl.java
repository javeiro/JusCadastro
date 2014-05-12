/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acrs.juscadastro.control;

import com.acrs.juscadastro.control.bind.AdvogadoBind;
import com.acrs.juscadastro.control.bind.ContactarBind;
import com.acrs.juscadastro.control.bind.EnderecoBind;
import com.acrs.juscadastro.control.bind.NotaBind;
import com.acrs.juscadastro.control.bind.PessoalBind;
import com.acrs.juscadastro.model.dao.ContatoDAO;
import com.acrs.juscadastro.model.entity.Advogado;
import com.acrs.juscadastro.model.entity.Contato;
import com.acrs.juscadastro.report.LoadReportContato;
import com.acrs.juscadastro.view.dialog.DlgAgendaTelefonica;
import com.acrs.juscadastro.view.dialog.DlgAgendaTelefonicaEditar;
import com.acrs.juscadastro.view.dialog.DlgAgendaTelefonicaImprimir;
import com.acrs.juscadastro.view.dialog.DlgAgendaTelefonicaLocalizar;
import com.acrs.juscadastro.view.dialog.DlgAgendaTelefonicaTabela;
import com.acrs.juscadastro.view.interfaces.IPnlAdvogado;
import com.acrs.juscadastro.view.interfaces.IPnlContato;
import com.acrs.juscadastro.view.interfaces.IPnlContactar;
import com.acrs.juscadastro.view.interfaces.IPnlEndereco;
import com.acrs.juscadastro.view.interfaces.IPnlNota;
import com.acrs.juscadastro.view.interfaces.IPnlPessoal;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author acrs
 */
public class ContatoControl extends NavegacaoControl {

    private static final int FILTRADO_POR_NOME = 2;
    private static final int FILTRADO_POR_EMPRESA = 3;
    private static final int FILTRADO_POR_NASCIMENTO = 4;
    private static final int FILTRADO_POR_NOTAS = 5;

    static {
        buscarTodosIds();
    }

    private static Contato buscarPorId(Integer id) {
        return new ContatoDAO().buscarPorId(id);
    }

    // Filtro ------------------------------------------------------------------
    
    public static void mostrarFiltroAtual(DlgAgendaTelefonicaLocalizar f) {
        if (filtroAtual == FILTRADO_POR_TODOS) {
            f.getRbtTodos().doClick();
        } else if (filtroAtual == FILTRADO_POR_NASCIMENTO) {
            f.getRbtNascimento().doClick();
            f.getDtcLocalizar().setCalendar((Calendar) valorAtual);
        } else {
            if (filtroAtual == FILTRADO_POR_NOME) {
                f.getRbtNome().doClick();
            } else if (filtroAtual == FILTRADO_POR_EMPRESA) {
                f.getRbtEmpresa().doClick();
            } else {
                f.getRbtNotas().doClick();
            }
            f.getTxtLocalizar().setText((String) valorAtual);
        }
    }

    // Validacao ---------------------------------------------------------------
    
    public static boolean nomeExiste(String nome) {
        return new ContatoDAO().buscarPorNome(nome) != null;
    }

    public static boolean cpfjExiste(String cpfj) {
        return new ContatoDAO().buscarPorCpfj(cpfj) != null;
    }
    
    // CRUD --------------------------------------------------------------------

    public static void gravarRegistro(DlgAgendaTelefonicaEditar dlg) {
        ContatoDAO dao = new ContatoDAO();
        Contato c = materializar(dlg.getPnlPessoal(),
                dlg.getPnlNota(), dlg.getPnlEndereco(), dlg.getPnlContactar());
        if (c.getId() == null) {
            dao.salvar(c);
            recarregarIds();
        } else {
            dao.atualizar(c);
        }
    }
    
    public static void mostrarRegistro(IPnlContato f) {
        Integer id = f.getPnlPessoal().getIdAgendaTelefonica();
        if (id != null) {
            Contato c = buscarPorId(id);
            if (c != null) {
                //Preenche informações do painel pessoal
                PessoalBind.mostrarPessoal(c, f.getPnlPessoal());

                //Preenche informações do painel endereco
                EnderecoBind.mostrarEndereco(c.getEndereco(), f.getPnlEndereco());

                //Preenche informações do painel nota
                NotaBind.mostrarNota(c, f.getPnlNota());

                //Preenche informações do painel contato
                IPnlContactar iContato = f.getPnlContactar();
                ContactarBind.mostrarEmail(c.getEmail(), iContato);
                ContactarBind.mostrarFixo(c.getTelFixo(), iContato);
                ContactarBind.mostrarMovel(c.getTelMovel(), iContato);
                ContactarBind.mostrarFax(c.getTelFax(), iContato);

                //Preenche informações se for uma instancia da subclasse Advogado
                IPnlAdvogado iAdvogado = f.getPnlAdvogado();
                if (c instanceof Advogado) {
                    AdvogadoBind.mostrarAdvogado(((Advogado) c), iAdvogado);
                } else {
                    iAdvogado.getChkAdvogado().setEnabled(false);
                    iAdvogado.getChkAdvogado().setSelected(false);
                    iAdvogado.getTxtOAB().setText("");
                    iAdvogado.getTxtOAB().setEditable(false);
                }
            } else {
                JOptionPane.showMessageDialog((Component) f, "Contato não encontrado.");
                ((JDialog) f).dispose();
            }
        } else {
            JOptionPane.showMessageDialog((Component) f, "Contato não encontrado. Sem Id.");
            ((JDialog) f).dispose();
        }

    }

    public static void excluirRegistro(DlgAgendaTelefonica f) {
        Integer id = f.getPnlPessoal().getIdAgendaTelefonica();
        if (id != null) {
            if (id > 0) {
                ContatoDAO dao = new ContatoDAO();
                dao.excluir(id);
                recarregarIds();
            }
        }
    }

    public static void localizarRegistros(DlgAgendaTelefonicaLocalizar f) {
        if (f.getRbtTodos().isSelected()) {
            buscarTodosIds();
        } else if (f.getRbtNome().isSelected()) {
            buscarPorNomeIds(f.getTxtLocalizar().getText());
        } else if (f.getRbtEmpresa().isSelected()) {
            buscarPorEmpresaIds(f.getTxtLocalizar().getText());
        } else if (f.getRbtNascimento().isSelected()) {
            buscarPorNascimentoIds(f.getDtcLocalizar().getCalendar());
        } else if (f.getRbtNotas().isSelected()) {
            buscarPorNotasIds(f.getTxtLocalizar().getText());
        }
    }

    public static void listarRegistros(DlgAgendaTelefonicaTabela f) {
        String[] columnNames = new String[]{
            "Nome", "CPF/CNPJ", "Nascimento", "Empresa",
            "Cargo", "Logradouro", "Nº", "Complemento",
            "CEP:", "Bairro", "Cidade", "UF", "DDD Fixo",
            "Tel. Fixo", "DDD Móvel", "Tel. Móvel",
            "DDD Fax", "Tel. Fax", "E-mail", "OAB"};

        String[][] data = null;
        if (ids != null) {
            if (ids.size() > 0) {
                data = new String[ids.size()][20];

                int row = 0;
                for (Integer id : ids) {
                    Contato c = buscarPorId(id);
                    data[row][0] = c.getNome();
                    data[row][1] = c.getCpfj();

                    Calendar nascimento = c.getNascimento();
                    if (nascimento != null) {
                        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
                        data[row][2] = s.format(c.getNascimento().getTime());
                    }

                    data[row][3] = c.getEmpresa();
                    data[row][4] = c.getCargo();

                    data[row][5] = c.getEndereco().getLogradouro();
                    data[row][6] = c.getEndereco().getNumero();
                    data[row][7] = c.getEndereco().getComplemento();
                    data[row][8] = c.getEndereco().getCep();
                    data[row][9] = c.getEndereco().getBairro();
                    data[row][10] = c.getEndereco().getCidade();
                    if (c.getEndereco().getUf() != null) {
                        data[row][11] = c.getEndereco().getUf().toString();
                    }

                    data[row][12] = c.getTelFixo().getDdd();
                    data[row][13] = c.getTelFixo().getNumero();
                    data[row][14] = c.getTelMovel().getDdd();
                    data[row][15] = c.getTelMovel().getNumero();
                    data[row][16] = c.getTelFax().getDdd();
                    data[row][17] = c.getTelFax().getNumero();
                    data[row][18] = c.getEmail().getEndereco();

                    if (c instanceof Advogado) {
                        data[row][19] = ((Advogado) c).getOab();
                    }
                    row++;
                }
            }
        }
        JTable tab = f.getTblAgenda();
        tab.setModel(new DefaultTableModel(data, columnNames) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tab.getColumnModel().getColumn(0).setPreferredWidth(200);//Nome
        tab.getColumnModel().getColumn(1).setPreferredWidth(80);//CPF/CNPJ
        tab.getColumnModel().getColumn(2).setPreferredWidth(70);//Nascimento
        tab.getColumnModel().getColumn(3).setPreferredWidth(200);//Empresa
        tab.getColumnModel().getColumn(4).setPreferredWidth(150);//Cargo
        tab.getColumnModel().getColumn(5).setPreferredWidth(200);//Logradouro
        tab.getColumnModel().getColumn(6).setPreferredWidth(60);//Nº
        tab.getColumnModel().getColumn(7).setPreferredWidth(110);//Complemento
        tab.getColumnModel().getColumn(8).setPreferredWidth(70);//CEP
        tab.getColumnModel().getColumn(9).setPreferredWidth(90);//Bairro
        tab.getColumnModel().getColumn(10).setPreferredWidth(120);//Cidade
        tab.getColumnModel().getColumn(11).setPreferredWidth(27);//UF
        tab.getColumnModel().getColumn(12).setPreferredWidth(60);//DDD
        tab.getColumnModel().getColumn(13).setPreferredWidth(100);//Tel
        tab.getColumnModel().getColumn(14).setPreferredWidth(60);//DDD
        tab.getColumnModel().getColumn(15).setPreferredWidth(100);//Tel
        tab.getColumnModel().getColumn(16).setPreferredWidth(60);//DDD
        tab.getColumnModel().getColumn(17).setPreferredWidth(100);//Tel
        tab.getColumnModel().getColumn(18).setPreferredWidth(200);//Email
        tab.getColumnModel().getColumn(19).setPreferredWidth(70);//OAB
        tab.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    // Ids ---------------------------------------------------------------------
    
    private static void buscarTodosIds() {
        aplicarFiltro(new ContatoDAO().buscarTodosIds(), FILTRADO_POR_TODOS, null);
    }

    private static void buscarPorNomeIds(String nome) {
        aplicarFiltro(new ContatoDAO().buscarPorNomeIds(nome), FILTRADO_POR_NOME, nome);
    }

    private static void buscarPorEmpresaIds(String empresa) {
        aplicarFiltro(new ContatoDAO().buscarPorEmpresaIds(empresa), FILTRADO_POR_EMPRESA, empresa);
    }

    private static void buscarPorNascimentoIds(Calendar nascimento) {
        aplicarFiltro(new ContatoDAO().buscarPorNascimentoIds(nascimento), FILTRADO_POR_EMPRESA, nascimento);
    }

    private static void buscarPorNotasIds(String nota) {
        aplicarFiltro(new ContatoDAO().buscarPorNotasIds(nota), FILTRADO_POR_NOTAS, nota);
    }

    private static void recarregarIds() {
        switch (filtroAtual) {
            case FILTRADO_POR_TODOS: {
                buscarTodosIds();
                break;
            }
            case FILTRADO_POR_NOME: {
                buscarPorNomeIds((String) valorAtual);
                break;
            }
            case FILTRADO_POR_EMPRESA: {
                buscarPorEmpresaIds((String) valorAtual);
                break;
            }
            case FILTRADO_POR_NASCIMENTO: {
                buscarPorNascimentoIds((Calendar) valorAtual);
                break;
            }
            case FILTRADO_POR_NOTAS: {
                buscarPorNotasIds((String) valorAtual);
                break;
            }
        }
    }

    // Bind --------------------------------------------------------------------
    public static Contato materializar(IPnlPessoal iPessoal, IPnlNota iNota,
            IPnlEndereco iEndereco, IPnlContactar iContato) {
        Contato c = new Contato();
        preencherObjeto(iPessoal, iNota, iEndereco, iContato, c);

        return c;
    }
    
    public static void preencherObjeto(IPnlPessoal iPessoal, IPnlNota iNota,
            IPnlEndereco iEndereco, IPnlContactar iContato, Contato c) {

        PessoalBind.preencherPessoal(iPessoal, c);
        NotaBind.preencherNota(iNota, c);

        c.setEndereco(EnderecoControl.materializar(iEndereco));
        c.setEmail(EmailControl.materializar(iContato));
        c.setTelFixo(TelefoneControl.materializarFixo(iContato));
        c.setTelMovel(TelefoneControl.materializarMovel(iContato));
        c.setTelFax(TelefoneControl.materializarFax(iContato));
    }

    // Navegacao ---------------------------------------------------------------
    
    public static void irParaRegistro(Integer idx) {
        index = idx;
    }

    public static void mostrarPrimeiroRegistro(DlgAgendaTelefonica f) {
        if (ids != null) {
            index = 0;
            mostrarAtualRegistro(f);
            atualizarPaginador(f);
        } else {
            f.limpar();
        }
    }

    public static void mostrarAnteriorRegistro(DlgAgendaTelefonica f) {
        if (ids != null) {
            if (index > 0) {
                index--;
                mostrarAtualRegistro(f);
                atualizarPaginador(f);
            }
        }
    }

    public static void mostrarProximoRegistro(DlgAgendaTelefonica f) {
        if (ids != null) {
            if (index < ids.size() - 1) {
                index++;
                mostrarAtualRegistro(f);
                atualizarPaginador(f);
            }
        }
    }

    public static void mostrarUltimoRegistro(DlgAgendaTelefonica f) {
        if (ids != null) {
            index = ids.size() - 1;
            mostrarAtualRegistro(f);
            atualizarPaginador(f);
        }
    }

    public static void mostrarAtualRegistro(IPnlContato f) {
        if (ids != null) {
            Integer id = ids.get(index);
            f.getPnlPessoal().setIdAgendaTelefonica(id);
            mostrarRegistro(f);
        } else {
            f.limpar();
        }
    }

    // Impressao ---------------------------------------------------------------
    
    public static void imprimirRegistros(DlgAgendaTelefonicaImprimir d) throws JRException {
        List<Integer> lIds = null;
        if (d.getRbtRegistroAtual().isSelected()) {
            lIds = new ArrayList<>();
            lIds.add(ids.get(index));
        } else {
            lIds = ids;
        }
        LoadReportContato.showPreview(JusCadastroControl.getEscritorio(), lIds, d);
    }

}
