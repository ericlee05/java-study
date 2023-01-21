package replace_conditional_with_polymorphism;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        Queue<Person> immigrationQueue = new LinkedList(
                List.of(
                        new LocalPerson("대한민국", "누군가", "백수", 26),
                        new ForeignPerson("미합중국", "Anderson", "특파원", 22),
                        new ForeignPerson("일본국", "???", "사업가", 47),
                        new ForeignPerson("중화인민공화국", "???", "관광", 23),
                        new ForeignPerson("러시아 연방", "???", "회사원", 34)
                )
        );

        for(Person person: immigrationQueue) {
            System.out.printf("%s에서 온 %s씨, 입국 %s입니다.\n",
                    person.getCountry(),
                    person.getName(),
                    person.immigration() ? "허가" : "거부");
        }

    }
}
