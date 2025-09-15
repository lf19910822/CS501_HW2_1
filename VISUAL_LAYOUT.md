# Visual Layout of the ColorCard App

```
┌─────────────────────────────────────┐
│           ColorCard Demo            │
│                                     │
│  ┌─────────────────────────────────┐│
│  │  ┌─────────────────────────────┐││
│  │  │                             │││  
│  │  │        Red Card             │││  <- Red background, black border
│  │  │      (200x150 dp)           │││     padding: 16dp, border: 3dp
│  │  │                             │││
│  │  └─────────────────────────────┘││
│  └─────────────────────────────────┘│
│                                     │
│  ┌───────────────────────────────┐  │
│  │                               │  │
│  │       Blue Card               │  │  <- Blue background, white border  
│  │     (180x120 dp)              │  │     padding: 12dp, border: 4dp
│  │                               │  │
│  └───────────────────────────────┘  │
│                                     │
│    ┌───────────────────────────────┐│
│    │ ┌───────────────────────────┐ ││
│    │ │                           │ ││
│    │ │      Green Card           │ ││  <- Green background, yellow border
│    │ │    (220x140 dp)           │ ││     padding: 24dp, border: 2dp  
│    │ │                           │ ││
│    │ └───────────────────────────┘ ││
│    └───────────────────────────────┘│
│                                     │
└─────────────────────────────────────┘
```

## Modifier Applications:

**Red Card (ColorCard function):**
- size(200dp x 150dp) → padding(16dp) → background(Red) → border(3dp, Black)

**Blue Card (Alternative combination):**  
- size(180dp x 120dp) → background(Blue) → border(4dp, White) → padding(12dp)

**Green Card (Third combination):**
- padding(24dp) → size(220dp x 140dp) → border(2dp, Yellow) → background(Green)

Each card demonstrates different modifier combinations and ordering while fulfilling all requirements.