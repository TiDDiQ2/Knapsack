import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class sample implements Initializable {
    Knapsack knapsack = new Knapsack();

    int width, height;
    int widthCount = 1;
    int heightCount = 1;

    @FXML
    private Label item1;

    @FXML
    private Label item2;

    @FXML
    private Label item3;

    @FXML
    private Label item4;

    @FXML
    private Label item5;

    @FXML
    private Label item6;

    @FXML
    private Label item7;

    @FXML
    private Label item8;

    @FXML
    private Label item9;

    @FXML
    private Label item10;

    @FXML
    private Label item11;

    @FXML
    private Label item12;

    @FXML
    private Label item13;

    @FXML
    private Label item14;

    @FXML
    private Label item15;

    @FXML
    private TextField amount1;

    @FXML
    private TextField amount2;

    @FXML
    private TextField amount3;

    @FXML
    private TextField amount4;

    @FXML
    private TextField amount5;

    @FXML
    private TextField amount6;

    @FXML
    private TextField amount7;

    @FXML
    private TextField amount8;

    @FXML
    private TextField amount9;

    @FXML
    private TextField amount10;

    @FXML
    private TextField amount11;

    @FXML
    private TextField amount12;

    @FXML
    private TextField amount13;

    @FXML
    private TextField amount14;

    @FXML
    private TextField amount15;

    @FXML
    private TextField weight1;

    @FXML
    private TextField weight2;

    @FXML
    private TextField weight3;

    @FXML
    private TextField weight4;

    @FXML
    private TextField weight5;

    @FXML
    private TextField weight6;

    @FXML
    private TextField weight7;

    @FXML
    private TextField weight8;

    @FXML
    private TextField weight9;

    @FXML
    private TextField weight10;

    @FXML
    private TextField weight11;

    @FXML
    private TextField weight12;

    @FXML
    private TextField weight13;

    @FXML
    private TextField weight14;

    @FXML
    private TextField weight15;

    @FXML
    private Button proceed;

    @FXML
    private TextField maxWeight;

    @FXML
    private Label itemsToCarry;

    @FXML
    private Label maxValueCarry;

    @FXML
    private Button nextStep;

    @FXML
    private Button lastStep;

    @FXML
    private Spinner<Integer> numberSpinner;

    @FXML
    private TableView<String[]> tableView = new TableView<>();

    @FXML
    private ImageView bag;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 15);
        valueFactory.setValue(1);
        numberSpinner.setValueFactory(valueFactory);
        knapsack.n = 1;
        numberSpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                knapsack.n = numberSpinner.getValue();
                switch (knapsack.n) {
                    case 1:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(false); weight2.setVisible(false); item2.setVisible(false);
                        amount3.setVisible(false); weight3.setVisible(false); item3.setVisible(false);
                        amount4.setVisible(false); weight4.setVisible(false); item4.setVisible(false);
                        amount5.setVisible(false); weight5.setVisible(false); item5.setVisible(false);
                        amount6.setVisible(false); weight6.setVisible(false); item6.setVisible(false);
                        amount7.setVisible(false); weight7.setVisible(false); item7.setVisible(false);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 2:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(false); weight3.setVisible(false); item3.setVisible(false);
                        amount4.setVisible(false); weight4.setVisible(false); item4.setVisible(false);
                        amount5.setVisible(false); weight5.setVisible(false); item5.setVisible(false);
                        amount6.setVisible(false); weight6.setVisible(false); item6.setVisible(false);
                        amount7.setVisible(false); weight7.setVisible(false); item7.setVisible(false);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 3:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(false); weight4.setVisible(false); item4.setVisible(false);
                        amount5.setVisible(false); weight5.setVisible(false); item5.setVisible(false);
                        amount6.setVisible(false); weight6.setVisible(false); item6.setVisible(false);
                        amount7.setVisible(false); weight7.setVisible(false); item7.setVisible(false);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 4:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(false); weight5.setVisible(false); item5.setVisible(false);
                        amount6.setVisible(false); weight6.setVisible(false); item6.setVisible(false);
                        amount7.setVisible(false); weight7.setVisible(false); item7.setVisible(false);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 5:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(false); weight6.setVisible(false); item6.setVisible(false);
                        amount7.setVisible(false); weight7.setVisible(false); item7.setVisible(false);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 6:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(false); weight7.setVisible(false); item7.setVisible(false);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 7:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(false); weight8.setVisible(false); item8.setVisible(false);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 8:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(false); weight9.setVisible(false); item9.setVisible(false);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 9:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(false); weight10.setVisible(false); item10.setVisible(false);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 10:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(true); weight10.setVisible(true); item10.setVisible(true);
                        amount11.setVisible(false); weight11.setVisible(false); item11.setVisible(false);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 11:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(true); weight10.setVisible(true); item10.setVisible(true);
                        amount11.setVisible(true); weight11.setVisible(true); item11.setVisible(true);
                        amount12.setVisible(false); weight12.setVisible(false); item12.setVisible(false);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 12:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(true); weight10.setVisible(true); item10.setVisible(true);
                        amount11.setVisible(true); weight11.setVisible(true); item11.setVisible(true);
                        amount12.setVisible(true); weight12.setVisible(true); item12.setVisible(true);
                        amount13.setVisible(false); weight13.setVisible(false); item13.setVisible(false);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 13:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(true); weight10.setVisible(true); item10.setVisible(true);
                        amount11.setVisible(true); weight11.setVisible(true); item11.setVisible(true);
                        amount12.setVisible(true); weight12.setVisible(true); item12.setVisible(true);
                        amount13.setVisible(true); weight13.setVisible(true); item13.setVisible(true);
                        amount14.setVisible(false); weight14.setVisible(false); item14.setVisible(false);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 14:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(true); weight10.setVisible(true); item10.setVisible(true);
                        amount11.setVisible(true); weight11.setVisible(true); item11.setVisible(true);
                        amount12.setVisible(true); weight12.setVisible(true); item12.setVisible(true);
                        amount13.setVisible(true); weight13.setVisible(true); item13.setVisible(true);
                        amount14.setVisible(true); weight14.setVisible(true); item14.setVisible(true);
                        amount15.setVisible(false); weight15.setVisible(false); item15.setVisible(false);
                        break;
                    case 15:
                        amount1.setVisible(true); weight1.setVisible(true); item1.setVisible(true);
                        amount2.setVisible(true); weight2.setVisible(true); item2.setVisible(true);
                        amount3.setVisible(true); weight3.setVisible(true); item3.setVisible(true);
                        amount4.setVisible(true); weight4.setVisible(true); item4.setVisible(true);
                        amount5.setVisible(true); weight5.setVisible(true); item5.setVisible(true);
                        amount6.setVisible(true); weight6.setVisible(true); item6.setVisible(true);
                        amount7.setVisible(true); weight7.setVisible(true); item7.setVisible(true);
                        amount8.setVisible(true); weight8.setVisible(true); item8.setVisible(true);
                        amount9.setVisible(true); weight9.setVisible(true); item9.setVisible(true);
                        amount10.setVisible(true); weight10.setVisible(true); item10.setVisible(true);
                        amount11.setVisible(true); weight11.setVisible(true); item11.setVisible(true);
                        amount12.setVisible(true); weight12.setVisible(true); item12.setVisible(true);
                        amount13.setVisible(true); weight13.setVisible(true); item13.setVisible(true);
                        amount14.setVisible(true); weight14.setVisible(true); item14.setVisible(true);
                        amount15.setVisible(true); weight15.setVisible(true); item15.setVisible(true);
                        break;
                }
            }
        });
    }

    private void generateTable(int height, int width) {
        ObservableList<String[]> data = FXCollections.observableArrayList();
        for (int i = 1; i <= height; i++) {
            String[] row = new String[width];
            for (int j = 0; j < width; j++) {
                row[j] = "0";
            }
            data.add(row);
        }
        tableView.getItems().clear();
        tableView.getColumns().clear();
        for (int i = 1; i <= width; i++) {
            TableColumn<String[], String> column = new TableColumn<>("Weight = " + (i-1));
            final int colIndex = i - 1;
            column.setCellValueFactory(cellData -> {
                String[] row = cellData.getValue();
                return new SimpleStringProperty(row[colIndex]);
            });
            tableView.getColumns().add(column);
        }
        tableView.setItems(data);
        tableView.setVisible(true);
    }

    private void insertValueAtCoordinates(TableView<String[]> tableView, int row, int col, String value) {
        if (row >= 0 && row < tableView.getItems().size() && col >= 0 && col < tableView.getColumns().size()) {
            tableView.getItems().get(row)[col] = value;
            tableView.refresh();
        }
    }

    @FXML
    void maxWeightCheck(KeyEvent event) {
        maxWeight.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    maxWeight.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount1Check(KeyEvent event) {
        amount1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount1.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount2Check(KeyEvent event) {
        amount2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount2.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount3Check(KeyEvent event) {
        amount3.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount3.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount4Check(KeyEvent event) {
        amount4.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount4.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount5Check(KeyEvent event) {
        amount5.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount5.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount6Check(KeyEvent event) {
        amount6.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount6.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount7Check(KeyEvent event) {
        amount7.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount7.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount8Check(KeyEvent event) {
        amount8.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount8.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount9Check(KeyEvent event) {
        amount9.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount9.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount10Check(KeyEvent event) {
        amount10.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount10.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount11Check(KeyEvent event) {
        amount11.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount11.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount12Check(KeyEvent event) {
        amount12.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount12.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount13Check(KeyEvent event) {
        amount13.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount13.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount14Check(KeyEvent event) {
        amount14.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount14.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void amount15Check(KeyEvent event) {
        amount15.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    amount15.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight1Check(KeyEvent event) {
        weight1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight1.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight2Check(KeyEvent event) {
        weight2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight2.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight3Check(KeyEvent event) {
        weight3.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight3.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight4Check(KeyEvent event) {
        weight4.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight4.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight5Check(KeyEvent event) {
        weight5.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight5.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight6Check(KeyEvent event) {
        weight6.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight6.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight7Check(KeyEvent event) {
        weight7.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight7.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight8Check(KeyEvent event) {
        weight8.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight8.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight9Check(KeyEvent event) {
        weight9.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight9.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight10Check(KeyEvent event) {
        weight10.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight10.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight11Check(KeyEvent event) {
        weight11.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight11.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight12Check(KeyEvent event) {
        weight12.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight12.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight13Check(KeyEvent event) {
        weight13.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight13.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight14Check(KeyEvent event) {
        weight14.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight14.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void weight15Check(KeyEvent event) {
        weight15.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    weight15.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }

    @FXML
    void startTable(ActionEvent event) {
        knapsack.weightMax = Math.abs(Integer.parseInt(maxWeight.getText()));
        switch(knapsack.n) {
            case 1:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                break;
            case 2:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                break;
            case 3:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                break;
            case 4:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                break;
            case 5:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                break;
            case 6:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                break;
            case 7:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                break;
            case 8:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                break;
            case 9:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                break;
            case 10:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                knapsack.objects[9] = new MyPair(Integer.parseInt(weight10.getText()), Integer.parseInt(amount10.getText()));
                break;
            case 11:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                knapsack.objects[9] = new MyPair(Integer.parseInt(weight10.getText()), Integer.parseInt(amount10.getText()));
                knapsack.objects[10] = new MyPair(Integer.parseInt(weight11.getText()), Integer.parseInt(amount11.getText()));
                break;
            case 12:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                knapsack.objects[9] = new MyPair(Integer.parseInt(weight10.getText()), Integer.parseInt(amount10.getText()));
                knapsack.objects[10] = new MyPair(Integer.parseInt(weight11.getText()), Integer.parseInt(amount11.getText()));
                knapsack.objects[11] = new MyPair(Integer.parseInt(weight12.getText()), Integer.parseInt(amount12.getText()));
                break;
            case 13:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                knapsack.objects[9] = new MyPair(Integer.parseInt(weight10.getText()), Integer.parseInt(amount10.getText()));
                knapsack.objects[10] = new MyPair(Integer.parseInt(weight11.getText()), Integer.parseInt(amount11.getText()));
                knapsack.objects[11] = new MyPair(Integer.parseInt(weight12.getText()), Integer.parseInt(amount12.getText()));
                knapsack.objects[12] = new MyPair(Integer.parseInt(weight13.getText()), Integer.parseInt(amount13.getText()));
                break;
            case 14:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                knapsack.objects[9] = new MyPair(Integer.parseInt(weight10.getText()), Integer.parseInt(amount10.getText()));
                knapsack.objects[10] = new MyPair(Integer.parseInt(weight11.getText()), Integer.parseInt(amount11.getText()));
                knapsack.objects[11] = new MyPair(Integer.parseInt(weight12.getText()), Integer.parseInt(amount12.getText()));
                knapsack.objects[12] = new MyPair(Integer.parseInt(weight13.getText()), Integer.parseInt(amount13.getText()));
                knapsack.objects[13] = new MyPair(Integer.parseInt(weight14.getText()), Integer.parseInt(amount14.getText()));
                break;
            case 15:
                knapsack.objects[0] = new MyPair(Integer.parseInt(weight1.getText()), Integer.parseInt(amount1.getText()));
                knapsack.objects[1] = new MyPair(Integer.parseInt(weight2.getText()), Integer.parseInt(amount2.getText()));
                knapsack.objects[2] = new MyPair(Integer.parseInt(weight3.getText()), Integer.parseInt(amount3.getText()));
                knapsack.objects[3] = new MyPair(Integer.parseInt(weight4.getText()), Integer.parseInt(amount4.getText()));
                knapsack.objects[4] = new MyPair(Integer.parseInt(weight5.getText()), Integer.parseInt(amount5.getText()));
                knapsack.objects[5] = new MyPair(Integer.parseInt(weight6.getText()), Integer.parseInt(amount6.getText()));
                knapsack.objects[6] = new MyPair(Integer.parseInt(weight7.getText()), Integer.parseInt(amount7.getText()));
                knapsack.objects[7] = new MyPair(Integer.parseInt(weight8.getText()), Integer.parseInt(amount8.getText()));
                knapsack.objects[8] = new MyPair(Integer.parseInt(weight9.getText()), Integer.parseInt(amount9.getText()));
                knapsack.objects[9] = new MyPair(Integer.parseInt(weight10.getText()), Integer.parseInt(amount10.getText()));
                knapsack.objects[10] = new MyPair(Integer.parseInt(weight11.getText()), Integer.parseInt(amount11.getText()));
                knapsack.objects[11] = new MyPair(Integer.parseInt(weight12.getText()), Integer.parseInt(amount12.getText()));
                knapsack.objects[12] = new MyPair(Integer.parseInt(weight13.getText()), Integer.parseInt(amount13.getText()));
                knapsack.objects[13] = new MyPair(Integer.parseInt(weight14.getText()), Integer.parseInt(amount14.getText()));
                knapsack.objects[14] = new MyPair(Integer.parseInt(weight15.getText()), Integer.parseInt(amount15.getText()));
                break;
        }
        height = knapsack.n + 1;
        width = knapsack.weightMax + 1;
        heightCount = 1;
        widthCount = 1;
        generateTable(height, width);
        nextStep.setVisible(true);
    }

    @FXML
    void startNextStep(ActionEvent event) {
        int[][] arr = knapsack.getDynamicArray();
        if (heightCount <= height-1) {
            lastStep.setVisible(true);
            insertValueAtCoordinates(tableView, heightCount, widthCount, Integer.toString(arr[heightCount][widthCount]));
            if(widthCount < width-1) {
                widthCount++;
            } else {
                widthCount = 1;
                heightCount++;
            }
        } else {
            nextStep.setVisible(false);
            maxValueCarry.setText(Integer.toString(knapsack.answer(arr)));
            itemsToCarry.setText(knapsack.backtrack(arr));
        }
    }

    @FXML
    void startLastStep(ActionEvent event) {
        if (widthCount != 1 || heightCount != 1) {
            maxValueCarry.setText("");
            itemsToCarry.setText("");
            nextStep.setVisible(true);
            if(widthCount > 1) {
                widthCount--;
            } else {
                widthCount = width - 1;
                heightCount--;
            }
            insertValueAtCoordinates(tableView, heightCount, widthCount, "0");
        } else {
            lastStep.setVisible(false);
        }
    }
}
