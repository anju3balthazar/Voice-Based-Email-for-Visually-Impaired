## Overview
This mobile application enables hands-free email management via voice commands, enhancing user independence and productivity. It simplifies the email management process by eliminating the need for mouse points and keyboard shortcuts, allowing users to touch anywhere on the screen to respond to emails.

## Tools used
   1. Android Studio
      
## Language used
   Java

## Features
Voice Commands: Users can manage their emails entirely through voice commands.

Simplified Interaction: Eliminates mouse points and keyboard shortcuts, allowing users to touch anywhere on the screen to respond to emails.

Voice Input for Recipient Email: Users can enter the receiver's email address through voice commands. The system will read back the entered input for confirmation before sending the email.

SMTP Protocol: Uses SMTP protocol to send emails, ensuring secure and reliable email delivery.

## How It Works
Google Speech-to-Text : Users enter the recipent email address, Subject and Message through voice.

Confirm Email Address: The system will repeat the entered email address for confirmation. Confirm the email address. If correct, proceed to the next step; if incorrect, re-enter the email address.

Compose Email: Dictate the subject and body of the email.

Send Email: Once everything is confirmed, the email will be sent using the SMTP protocol.
