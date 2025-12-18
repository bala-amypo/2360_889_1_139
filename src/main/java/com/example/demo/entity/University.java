package.com.example.demo.entity;

import jakarta.presistence.*;


public class User{
   @Id
    private Long id;
   @Coloumn(unique=true) 
    private String name;
    private String accreitationLevel;
    private String country;
    private Boolean active;
    public Long getId(){
        return id;
    }
     public User(Long id, String name, String accreitationLevel, String country, Boolean active) {
      this.id = id;
      this.name = name;
      this.accreitationLevel = accreitationLevel;
      this.country = country;
      this.active = active;
   }
    public String getName() {
       return name;
    }
    public String getAccreitationLevel() {
       return accreitationLevel;
    }
    public void setId(Long id) {
      this.id = id;
   }
    public void setName(String name) {
       this.name = name;
    }
    public void setAccreitationLevel(String accreitationLevel) {
       this.accreitationLevel = accreitationLevel;
    }
    public void setCountry(String country) {
       this.country = country;
    }
    public void setActive(Boolean active) {
       this.active = active;
    }
    public String getCountry() {
       return country;
    }
    public Boolean getActive() {
       return active;
    }
    }