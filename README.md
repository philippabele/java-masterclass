# Start learning java inside a docker container

Build a docker image from the provided Dockerfile. You have to replace the tokens
`<REPLACE-ME>` with your credentials and your API-Token:

`docker build --build-arg GH_TOKEN=<REPLACE-ME> --build-arg username=<REPLACE-ME> --build-arg email=<REPLACE-ME> -t java-masterclass .`

The next step is to create the private and public gpg key

`gpg --full-generate-key `

Afterwards you are prompted to specify details for the key. Here you can accept the defaults with the exception of the key size. Enter a key size of 4096. Finally you have to specify your userid information and assign a password. Use the following command to list the long form of the keys. 

`gpg --list-secret-keys --keyid-format=long`

Copy the key ID, in this case: 3AA5C34371567BD2

Enter this text with your copied ID. Your key will be printed to console.

`gpg --armor --export <id>`

Copy the printed key, beginning with BEGIN PGP PUBLIC KEY BLOCK and ending with END PGP PUBLIC KEY BLOCK.

Now you are able to add the key to your GitHub Account: https://github.com/settings/gpg/new