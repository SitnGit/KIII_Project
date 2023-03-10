package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Manufacturer;

import java.util.List;

public interface ManufacturerService {

    public List<Manufacturer> findAll();

    Manufacturer getManufacturerById(Long id);
    void createManufacturer(String name, String description, String adress);
}
