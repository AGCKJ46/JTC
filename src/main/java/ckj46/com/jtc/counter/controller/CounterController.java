package ckj46.com.jtc.counter.controller;

import ckj46.com.jtc.counter.entity.Counter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RequestMapping(path = "/api/counters")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CounterController {
    @GetMapping(path = "/{id}")
    public Counter getCounterById(HttpServletResponse response, @PathVariable Long id) throws IOException {
        log.info("getCounterById {}", id);
        Counter counter = new Counter();
        response.setStatus(HttpStatus.OK.value());
        return counter;
    }
}
