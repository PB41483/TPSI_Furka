/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.ogloszenie.web;


import wizut.tpsi.ogloszenie.jpa.FuelType;
import wizut.tpsi.ogloszenie.jpa.BodyStyle;
import wizut.tpsi.ogloszenie.jpa.CarModel;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author pb41483
 */
@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    @NotNull
    @Size(max = 255, min = 2)
    private String title;

    @Column(name = "year")
    @NotNull
    @Min(1900)
    private Integer year;

    @Column(name = "mileage")
    @NotNull
    @Min(0)
    private Integer mileage;

    @Column(name = "engine_size")
    @NotNull
    @Min(0)
    private BigDecimal engineSize;

    @Column(name = "engine_power")
    @NotNull
    @Min(0)
    private Integer enginePower;

    @Column(name = "doors")
    @NotNull
    @Min(1)
    @Max(5)
    private Integer doors;

    @Size(max = 30, min = 2)
    @Column(name = "colour")
    @NotNull
    private String colour;

    @Lob
    @Size(max = 65535, min = 2)
    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "price")
    @NotNull
    @Min(0)
    private Integer price;

    @JoinColumn(name = "model_id", referencedColumnName = "id")
    @ManyToOne
    private CarModel model;

    @JoinColumn(name = "body_style_id", referencedColumnName = "id")
    @ManyToOne
    private BodyStyle bodyStyle;

    @JoinColumn(name = "fuel_type_id", referencedColumnName = "id")
    @ManyToOne
    private FuelType fuelType;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setEngineSize(BigDecimal engineSize) {
        this.engineSize = engineSize;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public void setBodyStyle(BodyStyle bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public BigDecimal getEngineSize() {
        return engineSize;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public Integer getDoors() {
        return doors;
    }

    public String getColour() {
        return colour;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public CarModel getModel() {
        return model;
    }

    public BodyStyle getBodyStyle() {
        return bodyStyle;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

}
