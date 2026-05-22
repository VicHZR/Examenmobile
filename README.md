# 📱 Mobile UI Test Automation Architecture (Serenity BDD)

<p align="left">
  <a href="https://oracle.com">
    <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>
  </a>
  <a href="https://serenity-bdd.info">
    <img src="https://img.shields.io/badge/Serenity_BDD-0E76A8?style=for-the-badge&logo=java&logoColor=white"/>
  </a>
  <a href="https://appium.io">
    <img src="https://img.shields.io/badge/Appium-EE376D?style=for-the-badge&logo=appium&logoColor=white"/>
  </a>
  <a href="https://cucumber.io">
    <img src="https://img.shields.io/badge/Cucumber-BDD-23D96C?style=for-the-badge&logo=cucumber&logoColor=white"/>
  </a>
</p>

---

## 🚀 Overview

A production-grade **Mobile UI Automation Framework** engineered to execute robust behavior-driven (BDD) end-to-end testing on mobile applications. 

Built with **Java**, **Serenity BDD**, and mobile capability drivers, this repository implements advanced architectural patterns designed to simulate complex mobile user journeys, handle native device elements, and deliver high-fidelity live reporting with automated narrative test step tracking.

🎯 Focus: **Mobile application regression testing, behavioral test orchestration, UI multi-device interactions, and rich-living reporting.**

---

## 🎯 Key Technical Features

- 🏗️ **Serenity BDD Screenplay/POM Pattern:** High-cohesion architecture decoupling user actions, task executions, and target element locators from script step assertions.
- 🥒 **Gherkin Business Scenarios:** Native mapping of mobile user acceptance flows using structural, behavior-driven development design parameters.
- 📱 **Mobile Multi-Target Configuration:** Scalable capabilities configuration engine (`serenity.properties`) geared to target dynamic mobile app behaviors seamlessly.
- 📊 **Living Documentation Reports:** Automatic compilation of native Serenity HTML dashboards, embedding automated screenshots for every mobile UI transactional mutation.

---

## 🏗️ Project Architecture Layout

The testing framework organizes its native layers to preserve high maintainability and low component decoupling:

```text
Examenmobile/
│
├── src/
│   ├── main/java/             # Core architecture (Tasks, UI Locators, Page Elements)
│   └── test/
│       ├── java/              # Runner setups and Step Definition mapping hooks
│       └── resources/
│           └── features/      # Business-readable mobile acceptance criteria (.feature files)
│
├── App/                       # Target application binaries (.apk / .ipa payloads)
├── serenity.properties        # Global framework properties & mobile driver capability configs
├── pom.xml                    # Apache Maven manifest managing Serenity and Java dependencies
└── README.md                  # Technical engineering documentation
```

---

## 📊 Impact (CV-Level Highlights)

- 📈 **Accelerated Bug Detection:** Deployed automated mobile workflows using Serenity BDD, shortening interface regression cycles significantly.
- ⚙️ **Reduced Maintenance Costs:** Designed highly-modular selector definitions, minimizing structural script breakage under dynamic app layout mutations.
- 🤝 **Enhanced QA-to-Product Collaboration:** Bridged the communication gap across delivery teams by leveraging plain-text Gherkin feature user stories.
- 📋 **Audit-Ready Quality Footprints:** Enabled transparent bug reporting by leveraging Serenity's automated snapshot capabilities on step failures.

---

## ⚙️ Installation & Automation Run Guide

### 1. Pre-requisites & Machine Config
Ensure your host machine has the following structural components active:
- **Java SE Development Kit (JDK 11 or higher)**
- **Apache Maven 3.8+**
- Android SDK / Appium Node server engine configured on environmental paths.

### 2. Clone the Codebase Hub
```bash
git clone https://github.com
cd Examenmobile
```

### 3. Fetch Manifest Engines
```bash
mvn clean install -DskipTests
```

### 4. Execute the Mobile Automation Engine
```bash
mvn clean verify
```
📍 *After suite teardown runs complete, access the dynamic visual execution dashboards located at `target/site/serenity/index.html`.*

---

## 🔐 Mobile Best Practices Applied

- **Robust Resource Scoping:** Mobile elements map optimized app locators to maximize interaction speed across different device screen sizes.
- **State Cleanup Lifecycle:** Implements hooks to orchestrate the lifecycle of mobile device drivers, wiping execution app cache states between loops.
- **Strict Configuration Separation:** Keeps capabilities and infrastructure setups decoupled inside `serenity.properties`, preventing code mutation.

---

## 👨‍💻 Author

**Victor Guzmán**  
*Computational Scientist | Backend Engineer | Software Quality & Test Automation Specialist*  
- 🔗 **LinkedIn:** [https://linkedin.com](https://www.linkedin.com/in/victor-h-guzm%C3%A1n-a19361187/)
