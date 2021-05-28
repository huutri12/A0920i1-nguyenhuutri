package dao;


import model.rent_type;
import model.service;
import model.service_type;

import java.util.List;
public interface IServiceDao {
    void insertService(service service);
    service getService(String id);
    List<service> getAllService();
    boolean updateService(service service);
    boolean deleteService(int id);

    service_type getServiceType(int service_type_id);
    rent_type getRentType(int rent_type_id);
}
