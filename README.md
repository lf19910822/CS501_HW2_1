# CS501_HW2_1 - ColorCard Composable App

This Android application demonstrates a `ColorCard` composable function built with Jetpack Compose.

## ColorCard Implementation

The `ColorCard` composable function:
- Takes `color: Color` and `label: String` parameters
- Displays a colored card with a centered label
- Uses four required modifiers: `padding`, `background`, `border`, and `size`

## Features Demonstrated

### Three ColorCard Instances
1. **Red Card** - Standard ColorCard implementation with all modifiers
2. **Blue Card** - Alternative modifier combination with different sizes and border styling  
3. **Green Card** - Third modifier combination with different ordering and values

### Modifier Combinations Used

**Combination 1 (Red Card):**
```kotlin
modifier = Modifier
    .size(width = 200.dp, height = 150.dp)  // size modifier
    .padding(16.dp)                         // padding modifier
    .background(color, RoundedCornerShape(12.dp))  // background modifier
    .border(3.dp, Color.Black, RoundedCornerShape(12.dp))  // border modifier
```

**Combination 2 (Blue Card):**
```kotlin
modifier = Modifier
    .size(width = 180.dp, height = 120.dp)  // size modifier (different dimensions)
    .background(Color.Blue, RoundedCornerShape(8.dp))  // background modifier
    .border(4.dp, Color.White, RoundedCornerShape(8.dp))  // border modifier (different styling)
    .padding(12.dp)  // padding modifier (different value)
```

**Combination 3 (Green Card):**
```kotlin
modifier = Modifier
    .padding(24.dp)  // padding modifier (applied first)
    .size(width = 220.dp, height = 140.dp)  // size modifier
    .border(2.dp, Color.Yellow, RoundedCornerShape(16.dp))  // border modifier  
    .background(Color.Green, RoundedCornerShape(16.dp))  // background modifier
```

## Key Features
- ✅ ColorCard composable function with Color and String parameters
- ✅ Three different colored cards (Red, Blue, Green)
- ✅ Centered labels in each card
- ✅ Uses all four required modifiers: padding, background, border, size
- ✅ At least two different modifier combinations demonstrated
- ✅ Clean, responsive Material Design UI

## Project Structure
```
app/
├── src/main/
│   ├── java/com/example/colorcard/
│   │   ├── MainActivity.kt          # Main activity with ColorCard implementation
│   │   └── ui/theme/               # Compose theme files
│   ├── res/                        # Android resources
│   └── AndroidManifest.xml         # App manifest
├── build.gradle.kts                # App-level build configuration  
└── proguard-rules.pro             # ProGuard rules
```

## Build Requirements
- Android Studio Arctic Fox or later
- Kotlin 1.8.10+
- Android Gradle Plugin 8.1.2+
- Jetpack Compose BOM 2023.10.01+

## Running the App
1. Open the project in Android Studio
2. Sync Gradle dependencies
3. Run the app on an emulator or physical device
4. View the three ColorCard instances with different styling

The app demonstrates proper use of Compose modifiers and creates an attractive UI showcasing the ColorCard composable function.