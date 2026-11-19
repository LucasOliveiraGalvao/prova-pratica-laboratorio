package siga;

import java.util.ArrayList;
import java.util.List;

/** Adapter: converte o formato de matriz do servico legado uma unica vez. */
public class AdaptadorInventarioLegado implements FonteEquipamentos {

    private final InventarioLegadoWS legado;

    public AdaptadorInventarioLegado(InventarioLegadoWS legado) {
        this.legado = legado;
    }

    @Override
    public List<Equipamento> consultarEquipamentos() {
        List<Equipamento> equipamentos = new ArrayList<>();
        for (String[] linha : legado.consultarEquipamentos()) {
            Equipamento item = new Equipamento(linha[0], linha[1]);
            item.setDisponivel("D".equalsIgnoreCase(linha[2]));
            equipamentos.add(item);
        }
        return equipamentos;
    }
}
