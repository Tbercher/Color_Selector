# Color_Selector

An Android application that allows users to interactively mix, select, and view colors using RGB components. The app updates a live color preview along with corresponding HEX and RGB values in real time.

---

### Features

* **Interactive RGB SeekBars:** Adjust individual Red, Green, and Blue sliders (ranging from 0 to 255) to mix custom colors[cite: 1].
* **Real-Time Color Preview:** Live-updating `View` / `ImageView` displaying the background color corresponding to the active RGB values[cite: 1].
* **Value Indicators:** Text labels that dynamically display the current color in both HEX (`#RRGGBB`) and RGB `(R, G, B)` formats, as well as numeric readouts for each slider[cite: 1].
* **Preset Color Buttons:** Quick-select buttons for preset colors:
  * **White:** `RGB(255, 255, 255)` / `#FFFFFF`
  * **Black:** `RGB(0, 0, 0)` / `#000000`[cite: 1]
  * **Blue:** `RGB(0, 0, 255)` / `#0000FF`[cite: 1]
* **Reset Functionality:** Restores the application to its default initial state[cite: 1]:
  * Red: `64`[cite: 1]
  * Green: `128`[cite: 1]
  * Blue: `0`[cite: 1]
  * HEX: `#408000`[cite: 1]

---

### Project Structure & Implementation

* **UI Resources:** All user-facing text, button labels, and hints are stored in `res/values/strings.xml` without hardcoded strings in layout files[cite: 1].
* **Layouts:** Built using Android XML layouts containing components such as `SeekBar`, `TextView`, `Button`, and `View`/`ImageView`[cite: 1].
* **Event Handlers:** Dynamic `OnSeekBarChangeListener` and `OnClickListener` implementations to synchronize sliders, text labels, and the color display view simultaneously[cite: 1].

---

### File Header Format

Every source file submitted includes the required header comments[cite: 1]:

```java
// Assignment #: 2
// File Name: <FileName>
// Full Name: <Student Full Name>
