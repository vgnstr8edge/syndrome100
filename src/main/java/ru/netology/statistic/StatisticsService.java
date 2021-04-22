package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }




    public long lustFindMax(long[] incomes) {
        long current_max_index = 0;
        long current_lust_max = incomes[0];
        for (long income : incomes)
            if (current_lust_max <= income)
                current_lust_max = income;
        return current_lust_max;
    }


    public long findLustMax(long[] incomes) {
        //последнее максимальное значение
        long current_lust_max_index = 0;
        long current_lust_max = incomes[0];
        for (long income : incomes)
            if (current_lust_max <= income)
                current_lust_max = income;
        return current_lust_max;
    }

    public long findMin(long[] incomes) {
        //минимальное значение
        long current_min_index = 0;
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    public long findSum(long[] incomes) {
        //сумма значений
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return sum;
    }

    public long findMiddleSum(long[] incomes) {
        //среднее значение
        long middleSum = 0;
        middleSum = findSum(incomes) / incomes.length;
        return middleSum;
    }


    public long lustIndexMax(long[] incomes) {
        //номер последнего максимального значения
        long index = 0;
        long maxIndex = 0;
        long maxSumIndex = incomes[0];

        for (long income : incomes) {
            index += 1;
            if (maxSumIndex <= income) {
                maxSumIndex = income;
                maxIndex = index;
            }
        }
        return maxIndex;
    }


    public long minIndex(long[] incomes) {
        //номер минимального значения
        long index = 0;
        long minIndex = 0;
        long minSumIndex = incomes[0];

        for (long income : incomes) {
            index += 1;
            if (minSumIndex >= income) {
                minSumIndex = income;
                minIndex = index;
            }
        }
        return minIndex;
    }


    public long underMiddle(long[] incomes) {
        //кол-во значений, ниже среднего числа
        long index = 0;
        long middleIndex = findMiddleSum(incomes);

        for (long income : incomes) {
            if (middleIndex > income) {
                index += 1;
            }
        }
        return index;
    }


    public long overMiddle(long[] incomes) {
        //кол-во значений, выше среднего числа
        long index = 0;
        long middleIndex = findMiddleSum(incomes);

        for (long income : incomes) {
            if (middleIndex < income) {
                index += 1;
            }
        }
        return index;
    }








}