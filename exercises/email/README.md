## Exercise 2 - Message Sending
Your job is to send a bunch of messages to a certain inbox based on the content of the original message.

### Story 1: Forward all messages to the same target address
Messages will arrive on the inbox. We want to forward those messages to `reception`.

### Story 2: Messages should be split in different categories
* Messages containing the text _CV_ should be forwarded to `recruitment`, instead of `reception`
* Messages containing the text _promo_ or _advertisement_ should be forwarded to `spam`, instead of `reception`
* Messages containing the text _proposal_ should be forwarded to `sales`, instead of `reception`
* All other messages should still be sent to `reception`

### Story 3: Log: For each message we forwarded, a trace should be logged
You can choose an implementation yourself.

### Story 4: Aggregated reporting: by the end of the day, how many messages were assigned to a certain category
This report should be consultable on demand. 
