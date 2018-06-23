from . import message_sender


class Inbox:

    def receive_message(self, sender: str, message: str) -> None:
        message_sender.MessageSender.send_message(sender, message)
