package siliconvalley.model;

import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "NICK_NAME", nullable = false, length = 50)
    private String nickName;

    @Column(name = "AGE", nullable = false, length = 50)
    private int age;

    @Column(name = "SEX", nullable = false, length = 15)
    @Enumerated(EnumType.STRING)
    private Sex sex;

    public User() {
    }

    public User(String name, String nickName, int age, Sex sex) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(user.id, id) &&
                Objects.equals(user.name, name) &&
                Objects.equals(user.nickName, nickName) &&
                Objects.equals(user.age, age) &&
                Objects.equals(user.sex, sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nickName, age, sex);
    }

    @Override
    public String toString() {
        return "Id = " + id +
                "\nName = " + name +
                "\nNickName = " + nickName +
                "\nAge = " + age +
                "\nSex = " + sex;
    }
}
