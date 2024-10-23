package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.services.BlocServiceImpl;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {

    @Autowired
    private IBlocService blocService;

    @PostMapping
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.create(bloc);
    }

    @GetMapping("/{id}")
    public Bloc readById(@PathVariable Long id) {
        return blocService.readById(id);
    }

    @GetMapping
    public List<Bloc> readAll() {
        return blocService.readAll();
    }


    @PutMapping("/{id}")
    public Bloc updateBloc(@PathVariable Long id, @RequestBody Bloc bloc) {
        bloc.setId(id);
        return blocService.update(bloc);
    }

    @DeleteMapping("/{id}")
    public String deleteBloc(@PathVariable Long id) {
        return blocService.delete(id);
    }



    @GetMapping("/searchByKeyword")
    public List<Bloc> findBlocsByUniName(@RequestParam String keyword) {
        return ((BlocServiceImpl) blocService).findBlocsByUniversiteName(keyword);
    }
}
