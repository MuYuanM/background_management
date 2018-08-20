package backa_stage_management.service;
 
import java.util.List;

import backa_stage_management.pojo.Property;

public interface PropertyService {
    void add(Property c);
    void delete(int id);
    void update(Property c);
    Property get(int id);
    List list(int cid);
}
