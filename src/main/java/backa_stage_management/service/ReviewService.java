package backa_stage_management.service;
 
import java.util.List;

import backa_stage_management.pojo.Review;

public interface ReviewService {
     

    void add(Review c);

    void delete(int id);
    void update(Review c);
    Review get(int id);
    List list(int pid);

    int getCount(int pid);
}
