import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, r2_score

# Load the dataset
file_name = "03f4d1c1a55947025601.csv"  # Your dataset file
df = pd.read_csv(file_name)

# Preview the data
print("First 5 rows of the dataset:")
print(df.head())

# Features and target
X = df[['Temperature', 'Sunlight_Hours', 'Humidity']]  # Input features
y = df['Power_Output']  # Target variable

# Split the data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Train the model
model = LinearRegression()
model.fit(X_train, y_train)

# Predict on test data
y_pred = model.predict(X_test)

# Evaluation
print("\nModel Performance:")
print("Mean Squared Error (MSE):", mean_squared_error(y_test, y_pred))
print("R-squared Score:", r2_score(y_test, y_pred))

# Visualization
plt.figure(figsize=(10, 5))
plt.plot(y_test.values, label='Actual', marker='o')
plt.plot(y_pred, label='Predicted', marker='x')
plt.title("Actual vs Predicted Solar Power Output")
plt.xlabel("Test Sample")
plt.ylabel("Power Output")
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.savefig("solar_power_prediction_plot.png")  # Saves the plot
plt.show()

