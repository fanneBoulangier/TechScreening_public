from inbox.message_sender import MessageSender


class Inbox:

    def receive_message(self, sender: str, message: str) -> None:
        MessageSender.send_message(sender, message)
