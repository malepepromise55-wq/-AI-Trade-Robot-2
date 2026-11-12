# AI Trade Robot — Android starter

This is a native Android (Kotlin + Jetpack Compose) starter dashboard for a multi-market MT5-oriented trading assistant.

## What is included
- Android dashboard UI
- Forex, gold and crypto sample signal cards
- Demo-account balance display
- Manual/automatic-mode UI switch (the switch does NOT place trades)
- Risk-per-trade slider
- Dark trading-app styling

## Important limitations
This is a **UI prototype**, not a functioning AI trading system. Signal cards use hard-coded sample data. It has no live market feed, trained AI model, MT5 connection, broker credentials, order execution, or profit guarantee. Automatic trading is deliberately not connected.

## Open in Android Studio
1. Install Android Studio (latest stable) on a computer.
2. Extract this ZIP.
3. Choose **Open** and select the `AiTradeRobotAndroid` folder.
4. Allow Gradle sync, then run on an Android phone or emulator (Android 8.0+).

## What is needed for real MT5 trading
A secure backend service is required to connect to a MetaTrader 5 terminal/MetaTrader 5 Python integration or a broker-supported API. The backend should keep credentials server-side, validate every order, enforce stop-loss/position limits, and support demo mode first. Never put an MT5 password or API secret in the Android app.
