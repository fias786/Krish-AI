# Krish-AI
Save your plant by removing the crap with Krish-AI

## Inspiration
Every year, an estimated 10% of the global produce goes waste due to pests and crop pathogens. This is the reason why crop productivity in many countries is declining. For example, India is among the top producers of several crops such as wheat, rice, pulses, sugarcane and cotton. Most farmers cannot tell if a crop is diseased or not just by looking. Farmers rely on the income they get from their crops and many go broke if their crops turn bad. 

## What it does
**KrishAI** is an artificially intelligent mobile app that tells you if your crop is diseased. We have generated our own Tensorflow Lite Model which showed an accuracy of 91.54% and used Firebase ML Kit to host the same. Our pest detection algorithm provides farmers with the phone numbers of local pest control facilities. We also show effective tips on agriculture and display predicted weather data so that farmers can plan their crops accordingly. Our app is available in most local languages like Hindi, Bengali, Chinese, Korean, etc.

## How we built it
Our project KrishAI is crafted with love. The application itself is built by using Android. We are also using some other free API's from OpenWeatherMap for accessing weather information. The Tf.lite model is used for the analysis of the plant image. For the backend, we're using GCP for image post processing & endpoint data compression. The authentication of our app is being served via Firebase Authentication. And last but not the least, the chat server was deployed on a free dyno of Heroku.

## Challenges we ran into
Initially we were facing a problem to setup the Tf.lite model on our project as it was a very buffed one, so we had to reduce the dataset parameters & then optimize it so that it can run seamlessly on low end smartphones. Another important problem that we faced was to compress the uploaded image size on the GCS & throw that endpoint directly to cloud functions. 

## Accomplishments that we're proud of
We are proud of finishing the project on time which seemed like a tough task as we started working on it quite late due to other commitments and were also able to add most of the features that we envisioned for the app during ideation. And as always, overnight working was pretty fun! :)

## What we learned
A lot of things, both summed up in technical & non-technical sides. Also not to mention, we enhanced our googling and Stackoverflow searching skill during the hackathon ??

## What's next for KrishAI
We just really want this project to be a real app and have an impact on reducing global agro-waste! Still we would love to make it more scalable & cross-platform so that the user interaction increases & we can help minimize this food waste and hunger together :)
