# Color_Selector (Android)

An Android application that allows users to interactively mix, select, and view colors using RGB components. The app updates a live color preview along with corresponding HEX and RGB values in real time.

---

### Features

* **Interactive RGB SeekBars:** Adjust individual Red, Green, and Blue sliders (ranging from 0 to 255) to mix custom colors.
* **Real-Time Color Preview:** Live-updating `View` / `ImageView` displaying the background color corresponding to the active RGB values.
* **Value Indicators:** Text labels that dynamically display the current color in both HEX (`#RRGGBB`) and RGB `(R, G, B)` formats, as well as numeric readouts for each slider.
* **Preset Color Buttons:** Quick-select buttons for preset colors:
  * **White:** `RGB(255, 255, 255)` / `#FFFFFF`
  * **Black:** `RGB(0, 0, 0)` / `#000000`
  * **Blue:** `RGB(0, 0, 255)` / `#0000FF`
* **Reset Functionality:** Restores the application to its default initial state
  * Red: `64`
  * Green: `128`
  * Blue: `0`
  * HEX: `#408000`



