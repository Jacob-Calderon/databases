package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AnimalController {

    private Object getAllAnimal;

    public AnimalController(){

}

@GetMapping({"/animal"})
    public String getAllAnimal(){

    return "Capybara!!!";
}
    @GetMapping({"/animal/{id}"})

    public String getAnimalList(@PathVariable long id)
    {
        Object getAnimalList;
        return getAnimalList.getAnimalList(id);}

        switch((int)id)

    static {

        case 1:
            String animal = "Find the animals!!";

        case 2:
            String a = "looking for this?";


        default:
            String s1 = "unknown animal";



    }


    }

