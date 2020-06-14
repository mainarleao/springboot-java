package leao.mainar.exemplolombok.model;

import lombok.*;

/**
 * @author mainar
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private  String name;

    @Getter @Setter
    private  String lastName;

    @Getter @Setter
    private int age;

    /**
     *
     * @return age in months
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
