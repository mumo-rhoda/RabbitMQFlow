public class IntroRabbitMQ {
//RabbitMQ as message broker

    /*
    Purpose to Route messages from a producer to a consumer.
    RabbitMQ routes messages depending upon the messaging protocol it implements.
    Supports multiple messaging protocols.
    AMQP(Advanced Messaging Queuing Protocol)

    AMQP conceptual model has 3 entities:
    1. Queue
    2. Binding
    3. Exchange

    - Publisher pushes a message to RabbitMQ arrives at an exchange.
    - Exchange then distributes copies of these messages to various connected queues.
    - Finally consumers receive these messages.
message = payload + meta-data

Queues- follow FIFO. Place where RabbitMQ stores messages/data
        - make queue durable (safeguard)- Durability property
        - Name property, auto delete, exclusive
        - Consumer can pull the messages from queues or the queue can push.

Binding- are the rules that a queue defines while establishing a connection with an exchange.
        - a queue connected to multiple exchanges.
        -bindings are used to route messages to queue by exchange.

Exchanges and their types- a gateway to RabbitMQ for the messages.
    4 types of exchanges:
     Direct, Fanout, Topic, Header.
   1. Direct exchange delivers a message directly to the queues.
   Routing key == Binding key (round-robin load balanced distribution to consumer)
   2. Fanout - ignores routing keys and distributes a message to all connected queues.
   3. Topic - routes messages by matching routing key with a pattern in the binding key.
   Routing key == Pattern in binding key. (*#)(publish-subscribe pattern,)
   4. Header == routes messages based on keys present in the message header.
                -overlooks routing key attribute
                -

Message Acknowledgement - once message reaches destination, broker should delete the message from the queue.
    Automatic acknowledgement consumer receives or Explicit when consumer sends back acknowledgement





     */
}

