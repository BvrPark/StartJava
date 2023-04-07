package report;

//인터페이스와 추상클래스의 차이점과 코드
public class Report1 {
    /*Interface와 Abstract Class는 둘 다 추상화를 통해 코드 재사용성과 유연성을 높이기 위한 개념입니다.
    하지만 두 개념은 목적과 특징이 조금씩 다릅니다.

    Interface
    Interface는 추상 메서드와 상수만을 가지는 추상 클래스와 비슷한 개념입니다.
    하지만 클래스와는 다르게 다중 상속이 가능하며, 구현되어야 하는 모든 메서드를 강제하는 역할을 합니다.

    아래는 Interface의 예시입니다.*/

    public interface Animal {
        // 추상 메서드
        public abstract void eat();

        // 상수
        public final int MAX_AGE = 100;
    }

    /*위 코드에서는 Animal이라는 Interface를 정의하고 있습니다.
    이 Interface는 eat()이라는 추상 메서드와 MAX_AGE라는 상수를 가지고 있습니다.
    이 Interface를 구현하는 클래스는 반드시 eat() 메서드를 구현해야 합니다.
    */

    public class Cat implements Animal {
        @Override
        public void eat() {
            System.out.println("Fish");
        }
    }


    /*Abstract Class
    Abstract Class는 일반 클래스와는 다르게, 인스턴스를 생성할 수 없는 추상 클래스입니다.
    이 클래스를 상속받는 클래스에서 반드시 구현해야 하는 추상 메서드를 가지고 있으며,
    이를 통해 다른 클래스에서 공통으로 사용할 수 있는 기능을 추상화하여 재사용성과 유연성을 높일 수 있습니다.

    아래는 Abstract Class의 예시입니다.*/

    public abstract class AbstractAnimal {
        // 추상 메서드
        public abstract void eat();

        // 일반 메서드
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    /*위 코드에서는 Animal이라는 Abstract Class를 정의하고 있습니다.
    이 클래스는 eat()이라는 추상 메서드와 sleep()이라는 일반 메서드를 가지고 있습니다.
    이 클래스를 상속받는 클래스에서는 eat() 메서드를 반드시 구현해야 하며, sleep() 메서드를 구현하지 않아도 상관 없습니다.*/

    public class ExtendsCat extends AbstractAnimal {
        @Override
        public void eat() {
            System.out.println("Fish");
        }
    }

    /*위 코드에서는 Cat 클래스가 Animal Abstract Class를 상속받고 있습니다.
    따라서 Cat 클래스에서는 반드시 eat() 메서드를 오버라이딩해야 합니다.
    sleep() 메서드는 이미 Animal 클래스에서 구현되어 있기 때문에 구현할 필요가 없습니다.*/






}
