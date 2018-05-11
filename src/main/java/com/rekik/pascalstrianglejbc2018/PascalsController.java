package com.rekik.pascalstrianglejbc2018;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;

@Controller
public class PascalsController {


    @RequestMapping("/")
    public String addNewPascals(Model model)
    {
        model.addAttribute("pnumber", new PascalSize());
        return "pascalsinput";
    }

    @PostMapping("/postpascals")
    public String savePascals(@Valid @ModelAttribute("pnumber") PascalSize pascalSize, BindingResult result, Model model)

    {

        if(result.hasErrors()){
            return "pascalsinput";
        }


        int[][] array = new int[pascalSize.getSize()][pascalSize.getSize()];
        int sum =0;
        for(int i=0; i<pascalSize.getSize(); i++){
            for(int j=0; j<=i; j++){

                if(i==j){
                    array[i][j]=1;
                }
                else if(j==0) {
                    array[i][j] = 1;
                }
                else if(i>=2 && j>=1){
                    sum= array[i-1][j-1]+array[i-1][j];
                    array[i][j]=sum;
                }

            }

        }

        model.addAttribute("size",pascalSize.getSize());
        model.addAttribute("pascals",array);
        return "pascalsoutput";
    }


}
