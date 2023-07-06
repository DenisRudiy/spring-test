package com.test.springtestapp01.controller;

import com.test.springtestapp01.entity.GuitarEntity;
import com.test.springtestapp01.repository.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/guitars")
public class GuitarController {
    @Autowired
    GuitarRepository guitarRepository;

    @GetMapping("/retrieve")
    public List<GuitarEntity> getEntities(){
        return guitarRepository.findAll();
    }


    

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public GuitarEntity postEntity(@RequestBody GuitarEntity guitarEntity){
        return guitarRepository.save(guitarEntity);
    }

    @PutMapping("/update/{id}")
    public GuitarEntity putEntity(@PathVariable long id, @RequestBody GuitarEntity newEntity){
        GuitarEntity updatedEntity = guitarRepository.findById(id)
                .orElseThrow(()-> new ResourceAccessException("Not found guitarEntity with id: "+id));
        updatedEntity.setName(newEntity.getName());
        updatedEntity.setDescription(newEntity.getDescription());
        updatedEntity.setCategory(newEntity.getCategory());
        updatedEntity.setInventoryStatus(newEntity.getInventoryStatus());
        updatedEntity.setPhoto(newEntity.getPhoto());
        updatedEntity.setPrice(newEntity.getPrice());
        updatedEntity.setRate(newEntity.getRate());
        return guitarRepository.save(updatedEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntity(@PathVariable long id){
        guitarRepository.deleteById(id);
    }

}
