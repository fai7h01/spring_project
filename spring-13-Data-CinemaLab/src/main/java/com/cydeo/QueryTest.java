package com.cydeo;

import com.cydeo.repository.TicketRepository;
import com.cydeo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class QueryTest implements CommandLineRunner {

    private final UserRepository userRepository;
    private final TicketRepository ticketRepository;

    @Override
    public void run(String... args) throws Exception {
//
//        System.out.println("retrieveAll: " + userRepository.retrieveAll());
//        System.out.println(userRepository.retrieveUserByUsername("josieStory"));
        System.out.println(userRepository.retrieveUserInRangeOfAge(35,47));
      //  System.out.println(userRepository.retrieveUserInRange(35,47));

        System.out.println("-------ticket-------");
        System.out.println(ticketRepository.countTicketByUserAccount_Username("josieStory"));
        System.out.println(ticketRepository.findByUserAccount_Email("josie_story@email.com"));

    }
}
