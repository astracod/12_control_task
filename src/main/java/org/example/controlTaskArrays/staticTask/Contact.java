package org.example.controlTaskArrays.staticTask;


import lombok.EqualsAndHashCode;


@EqualsAndHashCode
public class Contact {
   private String name;
   private Long phone;

   public Contact(String name, Long phone) {
      this.name = name;
      this.phone = phone;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Long getPhone() {
      return phone;
   }

   public void setPhone(Long phone) {
      this.phone = phone;
   }
}
