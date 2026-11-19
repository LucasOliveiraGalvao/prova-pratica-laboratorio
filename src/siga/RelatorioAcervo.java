package siga;

import java.util.ArrayList;
import java.util.List;

/** Exibe o acervo usando uma fonte abstraida de equipamentos. */
public class RelatorioAcervo {

    private final FonteEquipamentos fonte;

    public RelatorioAcervo(FonteEquipamentos fonte) {
        this.fonte = fonte;
    }

    public List<Equipamento> listarTodos() {
        return new ArrayList<>(fonte.consultarEquipamentos());
    }

    public void imprimir() {
        System.out.println("   Situacao segundo o relatorio:");
        for (Equipamento item : listarTodos()) {
            System.out.println("     " + item + " - "
                    + (item.isDisponivel() ? "disponivel" : "baixado"));
        }
    }
}
