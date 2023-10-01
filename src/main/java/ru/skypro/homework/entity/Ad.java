package ru.skypro.homework.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.skypro.homework.repository.UserRepository;

import javax.persistence.*;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ad")
/*
проработать связь сущностей автор-объявление
 */
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int pk;                         //'id объявления'
    @Column(name = "image")
    private String image;                   //'ссылка на картинку объявления'
    @Column(name = "price", nullable = false)
    private int price;                      // 'цена объявления'
    @Column(name = "title", nullable = false)
    private String title;                   // 'заголовок объявления'
    @Column(name = "description")
    private String description;             // 'описание объявления'
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User author;          // автор объявления

    public Ad(String title, int price, String image, User author) {
        this.title = title;
        this.price = price;
        this.image = image;
        this.author = author;
    }
}