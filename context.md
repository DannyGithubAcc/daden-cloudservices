This is a context file to create understanding for the AI agent to provide an answer that has narrowed down as much as possible.

General request:
After every answer that involves codes or commands, give a small description of around 10 sentences why you choose this way to answer and how it relates to this context file.

Current technology stack in this project:
- Nx as the project monorepo.
    - When possible, use Nx commands when available before using npm commands in cases of building, installing and serving.
- Spring boot backend.
    - We are using Gradle. Read the Gradle file for the used dependencies we use in this project and relate the answer as much as possible to the used technologies and libraries we have in the project. Or when there are better suited technolgies, that handle problems more efficient, explain in a few sentences why you diversed from the used dependencies and why it is better to use your suggestion.
    - 
- Angular frontend.
- Kafka, which is running in a Docker container.
