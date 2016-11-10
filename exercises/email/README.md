## Exercise 2 - Message Sending
Your job is to send a bunch of messages to a certain inbox based on the content of the original message.

### Story 1: Forward all emails to the same target address
Emails will arrive on the info@cegeka.com address. We want to forward those emails to reception@cegeka.com.

### Story 2: Emails should be split in different categories
* Emails containing the text 'CV' should be forwarded to recruitment@cegeka.com, instead of reception@cegeka.com
* Emails containing the text 'promo' or 'advertisement' should be forwarded to spam@cegeka.com, instead of reception@cegeka.com
* Emails containing the text 'proposal' should be forwarded to sales@cegeka.com, instead of reception@cegeka.com
* All other emails should still be sent to reception@cegeka.com

### Story 3: Log: For each email we forwarded, a trace should be logged
You can choose an implementation yourself.

### Story 4: Aggregated reporting: by the end of the day, how many emails where assigned to a certain category
This functionality should be consultable on demand. 
