package sk.stuba.fei.uim.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address implements CharacterKey{

    private String address;
    private String psc;

    @Override
    public Character getKey() {
        return address.charAt(0);
    }
}
