# FunnyAgent 

**FunnyAgent** is a Java instrumentation agent that injects humorous and colorful prompts into your application during runtime. Whether you're debugging or just want your application logs to be a bit more entertaining, FunnyAgent brings life and laughs to your terminal!

---

## Features 🚀
- **Dynamic Instrumentation**: Modifies methods of target classes at runtime using `javassist`.
- **Humorous Logs**: Injects playful and witty prompts in your application output.
- **Colorful Output**: Adds ANSI color codes for visually distinctive and engaging logs.
- **Customizable Blurbs**: Pretends to interact with engines or processes, complete with delays and emojis.

---

## How It Works 🧠

FunnyAgent:
1. Instruments classes loaded by the JVM.
2. Identifies specific methods (like `start` or `printStatusTask`) in your application classes.
3. Inserts humorous and colorful logs before and after method executions.

Example of logs injected by FunnyAgent:
Agent: Hmm... I’m not sure about this... 🤔 Agent: Just a second... Let me process this... ⏳ Agent: Oh, it’s done!!! The engine will respond... 🏁 YOUPI! The engine has finished responding! 🎉


---

## Installation & Setup ⚙️

### Requirements
- Java 8 or higher
- Maven
- A sense of humor 😄

### Cloning the Repository
```bash
git clone https://github.com/your-username/funnyagent.git
cd funnyagent
java -javaagent:agent/target/agent.jar -jar app/target/app.jar
```

## Features 🚀
- Dynamic Interactions: Enjoy lively back-and-forth between FunnyAgent and your application.
- Colorful Prompts: Logs are styled with ANSI codes for better readability.
- Humorous Analogies: Logs mimic factory machinery, engines, or gears to represent complex data processes.

## Examples of FunnyAgent in Action 🎉

Start-Up Interaction
Logs injected before a method starts:

```bash
Agent: Alright, let's fire up the data engine! 🚀
Agent: Oh no, it’s stuck! Time to nudge it manually... 🔧
Agent: Okay, here we go... 🔄
Agent: Phew, it’s running smoothly now! ⚡
```
