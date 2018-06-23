import unittest
from inbox import inbox, message_sender


class TestInbox(unittest.TestCase):

    def setUp(self):
        self.message_sender_for_test = MessageSenderForTest()
        message_sender.MessageSender._instance = self.message_sender_for_test

    def test_receive_message__(self):
        inbox.Inbox().receive_message('Alice', 'Want to know a secret?')

        self.assertEqual(1, len(self.message_sender_for_test.messages))
        self.assertIn(
            ('reception', 'Want to know a secret?'),
            self.message_sender_for_test.messages.items()
        )


class MessageSenderForTest(message_sender.MessageSender):
    """Custom message_sender for testing
    """
    def __new__(cls) -> message_sender.MessageSender:
        return object.__new__(cls)

    def __init__(self) -> None:
        self.messages = {}

    def accept_message(self, receiver: str, message: str) -> None:
        self.messages[receiver] = message


if __name__ == '__main__':
    unittest.main()
