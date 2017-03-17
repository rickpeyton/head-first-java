# Picking up Java

Working through [Head First Java, 2nd
Edition](https://www.safaribooksonline.com/library/view/head-first-java/0596009208/)

## Build it

`docker build -t java-head-first .`

## Run it

Run a specific file

`docker run -it --rm --name java-app java-head-first java Shuffle1`

Or jump into the bash prompt

`docker run -it --rm --name java-app java-head-first /bin/bash`

And run a file from there

`java Shuffle1`
