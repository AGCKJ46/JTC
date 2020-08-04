package ckj46.com.jtc.counter.entity;

import ckj46.com.jtc.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Slf4j
@NoArgsConstructor
public class Counter extends BaseEntity {
    static int counterCounter = 0;

    LocalDateTime localDateTime = LocalDateTime.now().plusDays(counterCounter);
    String name = "Time Counter " + (++counterCounter);
}
