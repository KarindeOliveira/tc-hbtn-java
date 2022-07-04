import atividades.Atividade;

public class MaquinaWorkflow {

    void executar(Workflow workflow) {
        for (Atividade atividade : workflow.getAtividade()){
            atividade.executar();
        }

    }
}
