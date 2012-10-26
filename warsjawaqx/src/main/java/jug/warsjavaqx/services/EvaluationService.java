package jug.warsjavaqx.services;

import java.util.List;
import jug.warsjavaqx.model.Evaluation;

public interface EvaluationService {
    
    Evaluation getById(int id);
    
    void save(Evaluation evaluation);
    
    List<Evaluation> list(int from, int maxRows, String orderBy, boolean ascending);
    
    int getCount();
}
