import ru.vsu.*;

public class Main {
    public static void main(String[] args) {
        PetViewModel pets = new PetViewModel();

        PetInformation catInfo = new PetInformation();
        Owner ownerOleg = new Owner("Олег");
        //Animal cat = new Animal("Кот","Милый",true); не нужно

        Pet pet = new Pet(123,1,"Пенёк","кот","пушистый",true,ownerOleg,catInfo);
        System.out.println(pet.print());

        System.out.println(pet.getAge());
        System.out.println(pet.getBreed());

        Owner ownerElena = new Owner("Lena");
        catInfo.setTraits("длинный");
        Vaccine vaccine = new Vaccine("Для приколов","Вакциночка");
        catInfo.setVaccine(vaccine);
        Pet pet2 = new Pet(1,20,"Олег","человек","милый",true, ownerElena, catInfo);
        System.out.println(pet2.print());



        PetViewModel petViewModel = new PetViewModel();
        petViewModel.addOnePets(pet);
        petViewModel.addOnePets(pet2);
        String petInfo = petViewModel.print();  //те выводит сразу два челика
        System.out.println(petInfo);
    }
}
/*  ооп пара
Наследование классов
● Наследование - один из механизмов повторного использования кода, при
котором открытые члены класса родителя доступны классу потомку
● В Java при наследовании классов может быть только один родитель
● Суперкласс (ребёнок), подкласс(родитель), базовый класс(самый главный родитель)
● Иерархия наследования классов - дерево узлами, которого являются
классы
● Подкласс не наследует конструкторы супер класса!


Student extends Person

public student(String name){
   super(name) - вызов род конструктора (Person)
}

public student(){
   super() - вызов род конструктора (Person)
}

Перекрытие методов
■ Методы суперкласса могут быть перекрыты в
подклассе
■ Метод считается перекрытым в подклассе, если он
имеет такую же сигнатуру, что и в суперклассе
■ Область видимости метода подкласса должна быть не
ниже области видимости метода суперкласса

Градация модификаторов доступа
private < “default” < protected < public


Upcasting, Downcasting

public class Employee {}
public class Manager extends Emplyee {}  //Emplyee - сотрудник
Employee emp;
Manager mgr = new Manager();
emp = mgr; // Upcasting  - повысили на уровень наследования выше
// те mgr как был так и остался в emp теперь, но по иерархии он теперь выше
//и мб некие поля у него заблочены или методы не работают, что в Emplyee приват
mgr = emp; // Compiler ERROR. Downcasting
mgr = (Manager) emp; // Downcasting    - от родителя к наследываему, те вниз
Downcasting - всегда не очень, костыль


Оператор instanceof - безопасный даункастинг:

<<Class Reference Variable>>instanceof <<Class Name or Interface>>
Manager mgr = new Manager();
Employee emp = mgr;
if (emp instanceof Manager) {
mgr = (Manager)emp;
}




Модификатор final
● class
● method
● field (instance, static)
● variable
● method parameter


Корень иерархии типов
■ Базовым классом для всех классов является Object
  те всегда extends Object
○ boolean equals(Object)  - сравнивает обьекты  -  равны когда в 1 месте в памяти
○ void finalize()  - уже нет его
○ int hashCode()   - читает хеш код обьекта (хеш - числовое представление нашего обьекта (снился, номер паспорта)
    число полученное внутренностями обьекта  до 4 байтов)
○ String toString()  - строкове представление обьекта (имя типла + адресс ссылки) можем  переписать по нормальному)
○ Object clone()  - делает клон
○ Class getClass()


Class of Object
● Каждый объект в Java принадлежит какому-либо классу
● Каждый класс компилируется в бинарный файл .class
● Class Loader загружает определение класса из class-файла в JVM
● JVM создает объект типа java.lang.Class, который представляет двоичное
представление класса в JVM
● Класс в JVM идентифицируется полным именем и загрузчиком, который
его загрузил
● “Class - runtime descriptor of class source code”
● НЕ все классы загружаются при старте приложения
● Класс загружается перед первым использованием



 */


