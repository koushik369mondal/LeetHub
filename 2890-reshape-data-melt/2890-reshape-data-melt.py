import pandas as pd

def meltTable(report: pd.DataFrame) -> pd.DataFrame:
    return report.melt('product', var_name='quarter', value_name='sales')