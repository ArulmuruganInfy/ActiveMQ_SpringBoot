package com.demo.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.demo.jms.consumer.Receiver;
import com.demo.jms.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringJmsApplication implements  CommandLineRunner{

  @Autowired
  Sender sender;

  @Autowired
  Receiver receiver;

  public static void main(String[] args) {

      SpringApplication.run(SpringJmsApplication.class, args);
  }
    @Override
    public void run(String[] args) throws Exception {
      System.out.println("Running");
      sender.send("order.q", "Hello Spring JMS ActiveMQ!");
    }
  }

