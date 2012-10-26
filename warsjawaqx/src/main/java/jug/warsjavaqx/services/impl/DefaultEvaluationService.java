package jug.warsjavaqx.services.impl;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import java.util.List;
import jug.warsjavaqx.model.Evaluation;
import jug.warsjavaqx.services.EvaluationService;
import org.springframework.stereotype.Component;

@Component("evaluationService")
public class DefaultEvaluationService  extends AbstractEbeanService implements EvaluationService {

    @Override
    public List<Evaluation> list(int from, int maxRows, String orderBy, boolean ascending) {
        return ebeanServer.find(Evaluation.class).orderBy(orderBy +" " + (ascending ? "asc" : "desc")).findList();
    }
    
    @Override
    public Evaluation getById(@JsonRpcParam("id") int id) {
        return ebeanServer.find(Evaluation.class, id);
    }
    
    @Override
    public void save(@JsonRpcParam("evaluation") Evaluation evaluation) {
        ebeanServer.save(evaluation);
    }

    @Override
    public int getCount() {
        return ebeanServer.find(Evaluation.class).findRowCount();
    }
    
}
