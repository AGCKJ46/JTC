package ckj46.com.jtc.counter.controller;

import ckj46.com.jtc.counter.entity.Counter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping(path = "/api/counters")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CounterController {
    @GetMapping
    public List<Counter> getAllCounters(HttpServletResponse response) throws IOException {
        log.info("getAllCounters");
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        List<Counter> countersList = new ArrayList<>();
        countersList.add(counter1);
        countersList.add(counter2);

        response.setStatus(HttpStatus.OK.value());
        return countersList;
    }

    @GetMapping(path = "/{id}")
    public Counter getCounterById(HttpServletResponse response, @PathVariable Long id) throws IOException {
        log.info("getCounterById {}", id);
        Counter counter = new Counter();
        response.setStatus(HttpStatus.OK.value());
        return counter;
    }
}
