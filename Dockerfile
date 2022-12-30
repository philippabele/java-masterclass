FROM ubuntu:focal
# receive build-arguments 
ARG GH_TOKEN
ARG username
ARG email
# set GH_TOKEN as env variable 
ENV GH_TOKEN=${GH_TOKEN}
# apt update
RUN apt update
# install zsh
RUN apt install zsh -y
# install ohmyzsh and set to default shell
RUN yes | sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"
# install java
RUN apt install openjdk-17-jdk -y
RUN apt install openjdk-17-jre -y
# install git
RUN apt update -y && apt install git -y
# install gpg
RUN apt update -y && apt install gpg -y
# install curl
RUN type -p curl >/dev/null || apt install curl -y
# install kubectl
RUN curl -fsSL https://packages.cloud.google.com/apt/doc/apt-key.gpg | dd of=/usr/share/keyrings/kubernetes-archive-keyring.gpg \
    && chmod go+r /usr/share/keyrings/kubernetes-archive-keyring.gpg \
    && echo "deb [signed-by=/usr/share/keyrings/kubernetes-archive-keyring.gpg] https://apt.kubernetes.io/ kubernetes-xenial main" | tee /etc/apt/sources.list.d/kubernetes.list > /dev/null \
    && apt update \
    && apt install kubectl -y
# install GitHub CLI (gh)
RUN curl -fsSL https://cli.github.com/packages/githubcli-archive-keyring.gpg | dd of=/usr/share/keyrings/githubcli-archive-keyring.gpg \
    && chmod go+r /usr/share/keyrings/githubcli-archive-keyring.gpg \
    && echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/githubcli-archive-keyring.gpg] https://cli.github.com/packages stable main" | tee /etc/apt/sources.list.d/github-cli.list > /dev/null \
    && apt update \
    && apt install gh -y
# clone repo 
RUN gh repo clone philippabele/java-masterclass
# configure git to use GitHub CLI as a credential helper
RUN gh auth setup-git
# setup git
WORKDIR /java-masterclass
RUN git config gpg.program gpg
# RUN git config commit.gpgsign true
RUN git config user.name "${username}"
RUN git config user.email "${email}"
# Set entrypoint
CMD ["bash"]