package com.example.demo.domain.models.binding;

import com.example.demo.domain.entities.drinking.CoffeeTea;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class AddDrinkReqModel {

  private String name;
  private CoffeeTea coffeeTea;
  private Date today;

    public AddDrinkReqModel() {
    }


    @NonNull
    @Size(min = 3, max=15, message = "Invalid name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    public CoffeeTea getCoffeeTea() {
        return coffeeTea;
    }

    public void setCoffeeTea(CoffeeTea coffeeTea) {
        this.coffeeTea = coffeeTea;
    }





    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
