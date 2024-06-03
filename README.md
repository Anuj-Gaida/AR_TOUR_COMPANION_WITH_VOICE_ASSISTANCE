# AR-Tour-Companion-with-Voice-Assistance

The AR Tour Companion with Voice Assistance application is an android app integrated with Computer Vision, Natural Language Processing and AR Navigation. The app provides AR navigation feature to navigate users to recommended nearby amenities such as hotels and ATMs based on GPS location. It enables real-time identification of historical monuments of Bhaktapur Durbar Square using phone's camera. Additionally, it provides in-depth information about the recognized monuments by allowing audio-based query-answer conversation with Chatbot.

- The android app integrates Mapbox Vision SDK, Navigation SDK and Direction API
- The mobile app employs a MobileNetSSD V2 object detection model, which has been trained on a custom dataset, to initially identify monuments in the camera feed
- Once detected, the app does an API call to the server hosted on virtual machine in Microsoft Azure where the inferencing model named CNNs-LSTM is deployed which does the identification of the monument.
- An intelligent feature validates the monument's identification by comparing real-time device coordinates with monument location coordinates.
- Finally after identifying the monument user is allowed to perform audio based query to Chatbot , custom built Transformer model trained on custom dataset, deployed on the server.

&nbsp;

## Installation


1.  Inferencing Model Driver and API Source Code:
    - Can be opened and edited in the code editor like VS code
2.  Android Application Source Code:
    - Open the AR_Tour_Companion_android project folder in the Android Studio
    - Sign up or log in to your Mapbox account and grab a [Mapbox access token](https://docs.mapbox.com/help/glossary/access-token/)
    - Set your Mapbox token as environmental variable `MAPBOX_ACCESS_TOKEN`
    - Set your [Maven credentials](https://vision.mapbox.com/install/)

&nbsp;

## Output


Check out our Demo Video on YouTube  
&nbsp;
[![AR Tour Companion Demo Video](https://github.com/Amit250/AR-Tour-Companion-with-Voice-Assistance/assets/58304052/5f6cc6ed-0c32-46c4-8f2f-ab59793ffe0c)](https://youtu.be/QBhtDf_XD60?si=sdlNG031-_daO7VV)

